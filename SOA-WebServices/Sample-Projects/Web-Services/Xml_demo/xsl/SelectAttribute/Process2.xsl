<xsl:stylesheet version="1.0"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!--hello ...no text allowd here..-->

  
    
<xsl:template match="article[@reporter] ">
 <br><xsl:text>News HeadLines...</xsl:text></br>
<!--xsl:template match="article[@reporter = 'John']">

  <br><xsl:text>News HeadLines...</xsl:text></br>-->
	 
	
	<xsl:if test="@reporter='John'"> 
		<font color="blue">
		<br>
		<h2><xsl:value-of select="category"/></h2>		
		</br>
		<br>
		<h3><xsl:value-of select="text()"/></h3>		
		</br>
		
		<br>
		<h2><xsl:value-of select="summary"/></h2>		
		</br>
		</font> 
	</xsl:if> 
	
   </xsl:template> 
 

</xsl:stylesheet>
