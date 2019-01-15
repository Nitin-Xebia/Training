<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:fo="http://www.w3.org/1999/XSL/Format">

   <!--Require the version attribute for some browser(IE) to support the stylesheet-->

<xsl:template match="chapter">
  <fo:block break-before="page">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

<xsl:template match="chapter/title">
  <fo:block text-align="center" space-after="8pt"
            space-before="16pt" space-after.precedence="3">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

<xsl:template match="section">
  <xsl:apply-templates/>
</xsl:template>

<xsl:template match="section/title">
  <fo:block text-align="center" space-after="6pt"
            space-before="12pt" space-before.precedence="0"
            space-after.precedence="3">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

<xsl:template match="paragraph[1]" priority="1">
  <fo:block text-indent="0pc" space-after="7pt"
            space-before.minimum="6pt" space-before.optimum="8pt"
            space-before.maximum="10pt">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

<xsl:template match="paragraph">
  <fo:block text-indent="2pc" space-after="7pt"
            space-before.minimum="6pt" space-before.optimum="8pt"
            space-before.maximum="10pt">
    <xsl:apply-templates/>
  </fo:block>
</xsl:template>

</xsl:stylesheet>
