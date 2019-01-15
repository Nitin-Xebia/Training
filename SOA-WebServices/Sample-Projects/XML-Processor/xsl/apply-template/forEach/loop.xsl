<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>

<xsl:template match="table">
  <table>
    <xsl:for-each select="row">
      <tr>
         <xsl:for-each select="entry">
           <td>
	     <xsl:apply-templates/>
	  </td>
        </xsl:for-each>
      </tr>
    </xsl:for-each>
  </table>
</xsl:template>
</xsl:stylesheet>
