function toggleImage() {
    var imageContainer = document.getElementById("imageContainer");
    var image = document.getElementById("myImage");

    if (imageContainer.style.display === "none") {
        imageContainer.style.display = "block"; // Show the image container
        image.src = "https://placekitten.com/200/300"; // Set the image source if needed
    } else {
        imageContainer.style.display = "none"; // Hide the image container
    }
}