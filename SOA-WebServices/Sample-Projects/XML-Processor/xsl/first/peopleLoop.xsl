<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
  >
<!--xsl:output method="html"/--> 
<xsl:template match="/">
<HTML>
<BODY>
  
<TABLE BORDER="2">
	<TR>
		<TD><b>Name</b></TD>
		<TD><b>Address</b></TD>		 
		<TD><b>Email</b></TD>
	</TR>
	<xsl:for-each select="PEOPLE/PERSON">
	<TR>
		<TD><xsl:value-of select="NAME"/></TD>
		<TD><xsl:value-of select="ADDRESS"/></TD>		 
		<TD><xsl:value-of select="EMAIL"/></TD>
	</TR>
	</xsl:for-each>
</TABLE>
 
</BODY>
</HTML>
</xsl:template>
</xsl:stylesheet>
