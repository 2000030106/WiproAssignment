document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("vehicleForm");
    const progressBar = document.getElementById("formProgress");
    const captchaAns = document.getElementById("captchaAnswer");
    let captchaCorrect = 0;

    function genCaptcha() {
        const a = Math.floor(Math.random() * 10) + 1;
        const b = Math.floor(Math.random() * 10) + 1;
        captchaCorrect = a + b;
        document.getElementById("captchaQ").textContent = `${a} + ${b} = ?`;
    }

  function updateProgress() {
    const fields = form.querySelectorAll("input[required], select[required], textarea[required]");
    const total = fields.length;
    let validCount = 0;

    fields.forEach(el => {
        if (el.checkValidity()) validCount++;
    });

    const percent = total > 0 ? Math.round((validCount / total) * 100) : 0;
    progressBar.style.width = percent + "%";
    progressBar.textContent = percent + "%";
}


    function validateDates() {
        const dob = document.getElementById("dob");
        const purchaseDate = document.getElementById("purchaseDate");
        const insuranceExpiry = document.getElementById("insuranceExpiry");
        const pucDate = document.getElementById("pucDate");

        const dobDate = new Date(dob.value);
        const today = new Date();
        const age = today.getFullYear() - dobDate.getFullYear();
        if (age < 18 || (age === 18 && today < new Date(dobDate.setFullYear(dobDate.getFullYear() + 18)))) {
            dob.setCustomValidity("Must be 18 years or older");
        } else {
            dob.setCustomValidity("");
        }

        if (purchaseDate.value && new Date(purchaseDate.value) > today) {
            purchaseDate.setCustomValidity("Purchase date cannot be in the future");
        } else {
            purchaseDate.setCustomValidity("");
        }

        if (insuranceExpiry.value && new Date(insuranceExpiry.value) < today) {
            insuranceExpiry.setCustomValidity("Insurance expiry must be today or later");
        } else {
            insuranceExpiry.setCustomValidity("");
        }

        if (pucDate.value && new Date(pucDate.value) < today) {
            pucDate.setCustomValidity("PUC validity must be today or later");
        } else {
            pucDate.setCustomValidity("");
        }
    }

    function validateFile(input) {
        const file = input.files[0];
        if (file) {
            if (file.size > 2 * 1024 * 1024) {
                input.setCustomValidity("File size must be ≤ 2MB");
            } else {
                input.setCustomValidity("");
            }
        }
    }

    form.addEventListener("input", updateProgress);
    form.addEventListener("change", updateProgress);
    form.addEventListener("change", validateDates);
    form.addEventListener("change", (e) => {
        if (e.target.type === "file") validateFile(e.target);
    });

    form.addEventListener("submit", function (e) {
        e.preventDefault();
        validateDates();

        if (parseInt(captchaAns.value) !== captchaCorrect) {
            captchaAns.setCustomValidity("Incorrect captcha answer");
        } else {
            captchaAns.setCustomValidity("");
        }

        if (form.checkValidity()) {
            const toast = new bootstrap.Toast(document.getElementById("successToast"));
            toast.show();
            form.reset();
            genCaptcha();
            updateProgress();
        }
        form.classList.add("was-validated");
    });

    genCaptcha();
    updateProgress();
});
