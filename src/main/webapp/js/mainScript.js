function handleGraphClick(event) {
    const svg = event.currentTarget;

    const rInput = document.querySelector('[id*="change_r"]').value;
    if (!rInput) {
        showToast("Выберите значение R.", "error");
        return;
    }

    const center = 275;
    const scale = 100;
    const rect = svg.getBoundingClientRect();

    const x = ((event.clientX - rect.left - center) / scale);
    const y = ((center - (event.clientY - rect.top)) / scale);

    console.log('Graph click - X:', x, 'Y:', y);

    if (y < -5 || y > 5 || x < -5 || x > 5) {
        showToast("Клик по области со значениями вне диапазона");
        return;
    }

    document.querySelector('[id*="graph_x"]').value = x;
    document.querySelector('[id*="graph_y"]').value = y;

    submitFromGraph();
}



