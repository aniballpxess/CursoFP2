var selected_base;
var unselected_bases;

function getBase(selected_option) {
    selected_base = selected_option.value;
    unselected_bases = {
        bin: "Binario",
        oct: "Octal",
        dec: "Decimal",
        hex: "Hexadecimal"
    };
    delete unselected_bases[selected_option.value];
    const radio_buttons = document.getElementsByName("input_base");
    radio_buttons.forEach((btn) => { btn.disabled = true; });

    const numpad_buttons = document.getElementsByName("numpad_btn");
    let active_numpad;
    switch (selected_base) {
        case "bin":
            active_numpad = 2;
            break;
        case "oct":
            active_numpad = 8;
            break;
        case "dec":
            active_numpad = 10;
            break;
        case "hex":
            active_numpad = 16;
            break;
    }
    for (let i = 0; i < active_numpad; i++) {
        numpad_buttons[i].disabled = false;
    }
    document.getElementById("enter_btn").disabled = false;
}

function addDigit(digit_btn) {
    const input_num_display = document.getElementById('num_input');
    input_num_display.value = input_num_display.value + digit_btn.value;
}