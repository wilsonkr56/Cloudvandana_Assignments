const form = document.getElementById("my-form");
const popup = document.getElementById("popup");
const popupContent = document.getElementById("popup-content");
const closePopup = document.getElementById("close-popup");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  const formData = new FormData(form);
  const values = {};

  formData.forEach((value, key) => {
    values[key] = value;
  });

  let popupHTML = "";

  for (const key in values) {
    if (values.hasOwnProperty(key)) {
      const label = form.querySelector(`label[for="${key}"]`).textContent;
      popupHTML += `<p><strong>${label}</strong> ${values[key]}</p>`;
    }
  }

  document.getElementById("popup-values").innerHTML = popupHTML;
  popup.style.display = "flex";
});

closePopup.addEventListener("click", () => {
  popup.style.display = "none";
});
