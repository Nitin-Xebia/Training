<xsl:stylesheet version="1.0"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


 
<xsl:template match="article[@reporter]">


	<html><basefont face="Verdana" size="2"/><body>
	<h2>Today's Headlines</h2>

	<!--xsl:for-each select="article"-->

	<xsl:for-each select="//summary">
	 
		<!--xsl:if test="not(position() mod 2=0)"-->
		<!--xsl:if test="position() mod 2=0"-->
		<!--xsl:if test="position() mod 2>0"-->
		<!--xsl:if test="position()=1"-->
		 
		<xsl:if test="position()=last()">

		<font color="blue">
		<h1><xsl:value-of select="category"/></h1>
		<br>
		</br>

		<b><xsl:value-of select="text()"/></b>
		<!--The text() function retrieves and puts the text of current element here-->
		<br>
		</br>
		
		<i><xsl:value-of select="summary"/></i>

		</font><br/>
		</xsl:if>		
	</xsl:for-each>
	</body></html>
</xsl:template>

</xsl:stylesheet>
