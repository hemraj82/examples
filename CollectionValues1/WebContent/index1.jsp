<HTML>
<HEAD>
<TITLE>Add/Remove dynamic rows in HTML table</TITLE>
<SCRIPT language="javascript">
	function addRow(tableID) {

		var table = document.getElementById(tableID);

		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		var counts=rowCount-1;
		var cell1 = row.insertCell(0);
		var houseNum = document.createElement("input");
		houseNum.type = "text";
		houseNum.name="user.addresses["+counts+"].houseNum";
		cell1.appendChild(houseNum);

		var cell2 = row.insertCell(1);
		var city = document.createElement("input");
		city.type = "text";
		city.name="user.addresses["+counts+"].city";
		cell2.appendChild(city);

		var cell3 = row.insertCell(2);
		var country = document.createElement("input");
		country.type = "text";
		country.name="user.addresses["+counts+"].country";
		cell3.appendChild(country);

	}
</SCRIPT>
</HEAD>
<BODY>

<form action="submit" method="post">ID : <INPUT type="text"	name="user.id" /><br />
Name :<INPUT type="text" name="user.name" /><br />
Addresses :
<TABLE id="addressesTable" width="350px" border="1">
	<TR>
		<TD>House No.</TD>
		<TD>City</TD>
		<TD>Country</TD>
	</TR>
	<TR>
		<TD><INPUT type="text" name="user.addresses[0].houseNum" /></TD>
		<TD><INPUT type="text" name="user.addresses[0].city" /></TD>
		<TD><INPUT type="text" name="user.addresses[0].country" /></TD>
	</TR>
</TABLE>
<INPUT type="button" value="Add More" onclick="addRow('addressesTable')" />
<input type="submit" value="SUBMIT"/>
</form>
</BODY>
</HTML>