async function crearUsuario() {

    const name = document.getElementById("name").value;

    const hobbies = Array.from(
        document.querySelectorAll('input[name="hobbies"]:checked')
    ).map(cb => cb.value);

    const sex = document.getElementById("sex").value;

    if (name === "" || name == null) {
        alert("Escribe un nombre");
        return;
    }

    if (sex === null){
        alert("Selecciona un genero");
        return;
    }

    if (hobbies.length === 0) {
        alert("Selecciona un hobby");
        return;
    }

    const response = await fetch("http://localhost:8081/user", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            name: name,
            sex: sex,
            hobbies: hobbies
        })
    });

    const data = await response.json();
    console.log(data);
}