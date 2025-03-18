async function calculate() {
  const num1 = document.getElementById("num1").value;
  const num2 = document.getElementById("num2").value;

  //let result;
  //result = Number(num1) + Number(num2);


  const newURL = new URL("https://fluffy-space-spoon-wrg956qpg76w27jq-8080.app.github.dev/");
  newURL.pathname = "/add";
  newURL.searchParams.set("num1", num1);
  newURL.searchParams.set("num2", num2);

  try {
    const response = await fetch(newURL, {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
      },
    })
    const result = await response.json();

    document.getElementById("result").innerText = "Result: " + result.content;
    console.log(result)
  } catch (error) {
    console.log(error)
  }

}

function resetFields() {
  document.getElementById("num1").value = "";
  document.getElementById("num2").value = "";
  document.getElementById("operator").value = "+";
  document.getElementById("result").innerText = "Result: ";
}