<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" >

<xsl:output method="text"/> 

<xsl:template match="PERSON">
 <HTML>
  <BODY>

	<p> 
	  <xsl:text>Person Details are Here</xsl:text>
	  <!--add extra text into html-->
	</p>
	 

	  
	<TABLE BORDER="2">
		<TR>
			<TD><b>Name</b></TD>
			<TD><b>Address</b></TD>		 
			<TD><b>Email</b></TD>
		</TR>
		  

		   <TR>
			<TD>
			  <xsl:value-of select="NAME"/>
			 </TD>
			<TD>
			  <xsl:value-of select="ADDRESS"/>
			 </TD>		 
			<TD>
			 <xsl:value-of select="EMAIL"/>
			</TD>
		  </TR>		 
		 
	</TABLE>
 
 
</BODY>
</HTML>
</xsl:template>

</xsl:stylesheet>
