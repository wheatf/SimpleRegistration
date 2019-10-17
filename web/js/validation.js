function validateForm() {

    //Use a regular expression to check for the pattern of the admin number
    var regex = "^[0-9]{6}[a-zA-Z]{1}$";
    
    //Retrieve the VALUE from the "adminno" field found in the "student" form
    var adminnumber = document.forms["student"]["adminno"].value;
    
    //Run the regular expression to find a pattern match
    var match = adminnumber.match(regex);

    //If admin number does not match the admin number pattern
    //Note: equality comparison sign in JavaScript comprises three equal signs
    if(match === null) {
        alert("The admin number is not given in the correct format. Please ensure that is has 6 digits followed by an alphabet.");
        
        // Return false to tell the form NOT to proceed to the servlet
        return false;
    }
}