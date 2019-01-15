<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
  >
<!--xsl:output method="html"/--> 

<xsl:template match="/">   
<HTML>
  <BODY>
   <TABLE  BORDER="2" >
	 <TR>
		<TD><b>Name</b></TD>
		<TD><b>Address</b></TD>		 
		<TD><b>Email</b></TD>
	 </TR>

  <xsl:for-each select="PEOPLE/PERSON">
     <xsl:variable name="id" select="NAME"/>

   <!--It is case sensitive! so name and NAME are different-->

	 
	  

              
 <xsl:choose>
   <xsl:when test="$id='Adolf'">
     
        <TR> 
	<TD><font color="red">
           <xsl:value-of select="Name"/>	   
	   <xsl:text>-The Nazi Man!</xsl:text>
	   </font>
          </TD>	
	  <TD>
	   <xsl:value-of select="ADDRESS"/>
	  </TD>		 
	  <TD>
	    <xsl:value-of select="EMAIL"/>
	   </TD>
	    
	</TR>
  
  </xsl:when>
  <xsl:when test="$id='Mario Puzzo'">
         <TR> 
	 
	  <TD>
	  <font color="green">
           <xsl:value-of select="NAME"/>
	   <xsl:text>-The GodFather!</xsl:text>
	   </font> 
          </TD>	
	  <TD>
	   <xsl:value-of select="ADDRESS"/>
	  </TD>		 
	  <TD>
	    <xsl:value-of select="EMAIL"/>
	   </TD>
	    
	</TR>  
  </xsl:when>

  <xsl:otherwise>
  <!--This is default-->  
  <TR> 
    
     <TD>
	  <font color="orange">
              <xsl:value-of select="NAME"/>
	      <xsl:text>-The PeaceLoving!</xsl:text>
	   </font>  
          </TD>	
	  <TD>
	   <xsl:value-of select="ADDRESS"/>
	  </TD>		 
	  <TD>
	    <xsl:value-of select="EMAIL"/>
	   </TD>  
	</TR>   
    </xsl:otherwise>

  </xsl:choose> 

  <!---Terminate the stylesheet processing if 'terminate='yes' is found
	 
    Sends a message in a way that is dependent on the XSLT processor.
    It also depends where you put this message tag/
    reporting tag 'xsl:message'-->   

		   

</xsl:for-each>

<xsl:message terminate="yes">
		     <xsl:text>Error: no ID found for Name with eMail : </xsl:text>
		       <xsl:value-of select="EMAIL"/>      
		   </xsl:message>
         
		   
	 
       </TABLE>
       
       
 
      </BODY>
    </HTML>
  </xsl:template>

</xsl:stylesheet>
