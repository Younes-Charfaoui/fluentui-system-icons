package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Star32: ImageVector
  get() {
    if (_star32 != null) {
      return _star32!!
    }
    _star32 = fluentIcon(name = "Regular.Star32", 32f) {
      materialPath {
          moveTo(20.257F, 12.34F)
          lineToRelative(6.174F, 0.903F)
          lineToRelative(-4.476F, 4.39F)
          curveToRelative(-0.468F, 0.459F, -0.681F, 1.118F, -0.57F, 1.764F)
          lineToRelative(1.053F, 6.183F)
          lineToRelative(-5.502F, -2.91F)
          curveToRelative(-0.585F, -0.31F, -1.285F, -0.31F, -1.87F, 0.0F)
          lineToRelative(-5.502F, 2.91F)
          lineToRelative(1.054F, -6.183F)
          curveToRelative(0.11F, -0.646F, -0.103F, -1.305F, -0.57F, -1.764F)
          lineToRelative(-4.477F, -4.39F)
          lineToRelative(6.174F, -0.903F)
          curveToRelative(0.653F, -0.095F, 1.216F, -0.506F, 1.507F, -1.098F)
          lineToRelative(2.75F, -5.607F)
          lineToRelative(2.749F, 5.607F)
          curveToRelative(0.29F, 0.592F, 0.854F, 1.002F, 1.506F, 1.098F)
          close()
          moveToRelative(-2.909F, -8.5F)
          curveToRelative(-0.549F, -1.12F, -2.144F, -1.12F, -2.693F, 0.0F)
          lineToRelative(-3.2F, 6.52F)
          lineToRelative(-7.17F, 1.05F)
          curveToRelative(-1.228F, 0.179F, -1.72F, 1.686F, -0.834F, 2.555F)
          lineToRelative(5.196F, 5.096F)
          lineToRelative(-1.225F, 7.183F)
          curveToRelative(-0.209F, 1.227F, 1.08F, 2.16F, 2.18F, 1.578F)
          lineToRelative(6.4F, -3.385F)
          lineToRelative(6.398F, 3.385F)
          curveToRelative(1.1F, 0.582F, 2.39F, -0.351F, 2.18F, -1.578F)
          lineToRelative(-1.224F, -7.183F)
          lineToRelative(5.195F, -5.096F)
          curveToRelative(0.886F, -0.87F, 0.394F, -2.376F, -0.833F, -2.556F)
          lineToRelative(-7.171F, -1.048F)
          lineToRelative(-3.199F, -6.522F)
          close()        
      }
    }
    return _star32!!
  }

private var _star32: ImageVector? = null
