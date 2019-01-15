<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
  >
<!--xsl:output method="html"/--> 

<xsl:template match="PERSON">   
<HTML>
  <BODY>
   <xsl:variable name="Danger" select="NAME"/>

   <!--assign name to 'Danger' local variable-->
 
	 <xsl:if test="$Danger='Adolf'">  <!--No 'else' block..-->

           
         <TABLE  BORDER="2" >
	 <TR>
		<TD><b>Name</b></TD>
		<TD><b>Address</b></TD>		 
		<TD><b>Email</b></TD>
	 </TR>

	 <TR> 
              
		  <TD><font color="red">
		      <xsl:value-of select="NAME"/>
		      </font>
		  </TD>		

		<TD><xsl:value-of select="ADDRESS"/></TD>		 
		<TD><xsl:value-of select="EMAIL"/></TD>
		
	    
	 
	</TR>
	 
       </TABLE>
       
       </xsl:if>
 
      </BODY>
    </HTML>
  </xsl:template>

</xsl:stylesheet>
