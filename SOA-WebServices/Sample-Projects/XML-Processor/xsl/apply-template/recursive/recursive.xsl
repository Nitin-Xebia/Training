<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<!--Without version attribute some browsers(ie 6.0) may not display correctly-->

  <xsl:template match="doc">
   <html>
    <head><title>A Document</title></head>
    <body>
      <xsl:apply-templates/>
    </body></html>
  </xsl:template>

	<xsl:template match="para">
	  <p><xsl:apply-templates/></p>
	</xsl:template>

	<xsl:template match="strong">
	  <i> 
	    <xsl:apply-templates/>
	  </i> 
	</xsl:template>

	<xsl:template match="strong/strong">
	 <br><b>
          <xsl:apply-templates/>
	 </b>
	 </br>
	</xsl:template>

</xsl:stylesheet>
