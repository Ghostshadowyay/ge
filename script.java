
function showImage() {
    var img = document.getElementById('bread');
    img.style.visibility = 'visible';
}

function setImageVisible(id, visible) {
    var img = document.getElementById('bread');
    img.style.visibility = (visible ? 'visible' : 'hidden');
}