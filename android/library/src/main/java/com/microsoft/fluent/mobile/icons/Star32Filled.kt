package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Star32: ImageVector
  get() {
    if (_star32 != null) {
      return _star32!!
    }
    _star32 = fluentIcon(name = "Filled.Star32", 32f) {
      materialPath {
          moveTo(14.655F, 3.84F)
          curveToRelative(0.549F, -1.12F, 2.144F, -1.12F, 2.693F, 0.0F)
          lineToRelative(3.199F, 6.52F)
          lineToRelative(7.17F, 1.05F)
          curveToRelative(1.228F, 0.179F, 1.72F, 1.686F, 0.834F, 2.555F)
          lineToRelative(-5.195F, 5.096F)
          lineToRelative(1.224F, 7.183F)
          curveToRelative(0.21F, 1.227F, -1.08F, 2.16F, -2.18F, 1.578F)
          lineToRelative(-6.399F, -3.385F)
          lineToRelative(-6.399F, 3.385F)
          curveToRelative(-1.1F, 0.582F, -2.389F, -0.351F, -2.18F, -1.578F)
          lineToRelative(1.225F, -7.183F)
          lineToRelative(-5.196F, -5.096F)
          curveToRelative(-0.885F, -0.87F, -0.394F, -2.376F, 0.834F, -2.556F)
          lineToRelative(7.17F, -1.048F)
          lineToRelative(3.2F, -6.522F)
          close()        
      }
    }
    return _star32!!
  }

private var _star32: ImageVector? = null
