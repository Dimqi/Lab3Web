document.addEventListener("DOMContentLoaded", function(){
	
	function updateClock() {
		if (!window.currentTime){
		console.log("Время нет");
		return;
		
		}
		const partsOfTime = window.currentTime.split(":")
		
		
	    const hr = parseInt(partsOfTime[0], 10);;
	    const min = parseInt(partsOfTime[1], 10);;
	    const sec = parseInt(partsOfTime[2], 10);;

	    const secDeg = sec * 6; // 360° / 60
	    const minDeg = min * 6 + sec * 0.1; // плавное движение
	    const hrDeg = (hr % 12) * 30 + min * 0.5; // 360° / 12

		document.getElementById('second-hand').style.transform = `rotate(${secDeg}deg)`;
		document.getElementById('minute-hand').style.transform = `rotate(${minDeg}deg)`;
		document.getElementById('hour-hand').style.transform = `rotate(${hrDeg}deg)`;
	}
	
	window.updateClock = updateClock;

	
	
});



