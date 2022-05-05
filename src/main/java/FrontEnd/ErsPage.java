package FrontEnd;

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Krusty Krab</title>
    
    <!-- Here, I've pasted in some bootstrap for the sake of STYLE-->
    <link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
			crossorigin="anonymous"
	/>
		<!--bootstrap classes cheatsheet-->
		<!--https://www.w3schools.com/bootstrap/bootstrap_ref_css_buttons.asp-->

</head>

<br>
    
    <!--A div with a class of "container" makes it so that bootstrap will be applied to this div-->
    <!-- Everything within this div will get styled with the appropriate bootstrap styling-->
    <div class="container">

        <h3>Welcome to the Krusty Krab!</h3>

        <div id="loginRow" class="row">
            <h3 id="welcomeHead">Please Enter Your Login Credentials</h3>
            <input id="username" placeholder="Username"/>
            <input id="password" type="password" placeholder="Password"/>
            <button id="loginButton" class="btn btn-primary col-sm-3">Login</button>
        <!-- col-sm-3? this will make the login button take up 25% of the row -->
        <!-- col-sm-12 for instance would make the button take up the entire row -->
        </div>

       <br>
       <br>

        <!-- With our CLI in P0, we were able to populate our DB data in the Java console -->
        <!-- But now, we have a webpage and we need a way to store the data we gather -->
        <!-- I want a table of employee information which we'll SELECT from the DB -->

        <div id="table-row" class="row">
            <table id="krustyTable" class="table table-dark table-bordered table-hover table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Role ID</th>
                    </tr>
                </thead>

                <tbody id="employeeBody">
                    <!-- We'll leave the table body blank - it will be filled with data by our JS-->
                </tbody>

            </table>
        </div>

        <button id="getEmployeeButton" class="btn btn-danger">Show Employees</button>

    </div>

    <!-- We need to link a JS file to this HTML file to give it functionality -->
    <script src="krustyKrab.js"></script>
</body>
</html>