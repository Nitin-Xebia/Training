<xsl:stylesheet version="1.0"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/headlines">
	<html>
	<basefont face="Verdana" size="2"/>
	<body>
	<!-- 
	Go and apply all the templates for the root
	--> 
	<xsl:for-each select="article">
		<xsl:apply-templates />
	 <hr/> <!--Draw horizontal rule line..-->
	</xsl:for-each>
	</body>
      </html>
</xsl:template>

</xsl:stylesheet>