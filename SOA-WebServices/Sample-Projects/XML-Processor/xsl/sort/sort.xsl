<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

 

<xsl:template match="table">
   
  <table><td>
    <xsl:apply-templates select="row">
      <xsl:sort data-type="number" select="./cell[1]" order="descending" />
       <!--xsl:sort data-type="text" select="./cell[2]" order="ascending" /-->
       <!--xsl:sort data-type="text"/-->
    </xsl:apply-templates>
  </td></table>
</xsl:template>
</xsl:stylesheet>


