<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

<xsl:template match="para">
  <p>
   <xsl:apply-templates/>
   <!--If commented it will not apply the template-->
  </p>
</xsl:template>

<xsl:template match="strong">
  <h1>
    <xsl:apply-templates/>
  </h1>
</xsl:template>

</xsl:stylesheet>


