const form = document.getElementById('usb-form');
const resultDiv = document.getElementById('result');

form.addEventListener('submit', event => {
    event.preventDefault();
    
    const usbSize = +document.getElementById('usb-size').value;
    const usbSpeed = +document.getElementById('usb-speed').value;
    
    if (!usbSize || !usbSpeed) {
        resultDiv.innerHTML = '<p>Please enter a valid USB size and speed.</p>';
        return;
    }
    
    const fillTimeSeconds = Math.round((usbSize * 1000) / usbSpeed * 100) / 100;
    const fillTimeMinutes = Math.round(fillTimeSeconds / 60 * 100) / 100;
    const fillTimeHours = Math.round(fillTimeMinutes / 60 * 100) / 100;
    const Mbps = Math.round(usbSize * 8000 / usbSpeed * 100) / 100;
    
    resultDiv.innerHTML = `
        <p>It will take ${fillTimeSeconds} seconds to fill the USB.</p>
        <p>It will take ${fillTimeMinutes} minutes to fill the USB.</p>
        <p>It will take ${fillTimeHours} hours to fill the USB.</p>
    `;
    
    const image = document.querySelector('.flying-png');
    image.classList.remove('animate'); // Remove 'animate' class first
    image.style.display = 'block';
    void image.offsetWidth; // Trigger a reflow to restart the animation
    image.classList.add('animate'); // Add 'animate' class again
});
