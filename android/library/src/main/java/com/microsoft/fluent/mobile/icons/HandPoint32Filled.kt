package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.HandPoint32: ImageVector
  get() {
    if (_handPoint32 != null) {
      return _handPoint32!!
    }
    _handPoint32 = fluentIcon(name = "Filled.HandPoint32", 32f) {
      materialPath {
          moveTo(12.004F, 5.5F)
          curveToRelative(0.0F, -1.933F, 1.567F, -3.5F, 3.5F, -3.5F)
          curveTo(17.439F, 2.0F, 19.0F, 3.567F, 19.0F, 5.5F)
          verticalLineToRelative(5.545F)
          lineToRelative(4.06F, 0.621F)
          curveToRelative(4.085F, 0.627F, 6.741F, 4.634F, 5.726F, 8.639F)
          lineToRelative(-1.51F, 5.96F)
          curveToRelative(-0.396F, 1.56F, -1.688F, 2.73F, -3.279F, 2.972F)
          lineToRelative(-4.731F, 0.718F)
          curveToRelative(-2.086F, 0.316F, -3.828F, -1.054F, -4.644F, -2.692F)
          curveToRelative(-1.131F, -2.271F, -3.827F, -5.337F, -11.706F, -8.72F)
          curveToRelative(-0.849F, -0.366F, -1.202F, -1.44F, -0.642F, -2.238F)
          curveToRelative(1.874F, -2.666F, 5.354F, -3.663F, 8.355F, -2.394F)
          lineToRelative(1.375F, 0.58F)
          verticalLineTo(5.5F)
          close()        
      }
    }
    return _handPoint32!!
  }

private var _handPoint32: ImageVector? = null
