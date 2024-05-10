package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.HandPoint32: ImageVector
  get() {
    if (_handPoint32 != null) {
      return _handPoint32!!
    }
    _handPoint32 = fluentIcon(name = "Regular.HandPoint32", 32f) {
      materialPath {
          moveTo(15.505F, 4.0F)
          curveToRelative(-0.829F, 0.0F, -1.5F, 0.672F, -1.5F, 1.5F)
          verticalLineTo(16.0F)
          curveToRelative(0.0F, 0.335F, -0.169F, 0.648F, -0.449F, 0.834F)
          curveToRelative(-0.279F, 0.185F, -0.633F, 0.218F, -0.942F, 0.087F)
          lineTo(9.85F, 15.753F)
          curveToRelative(-1.938F, -0.82F, -4.157F, -0.31F, -5.546F, 1.212F)
          curveToRelative(7.669F, 3.389F, 10.72F, 6.62F, 12.109F, 9.406F)
          curveToRelative(0.56F, 1.126F, 1.585F, 1.753F, 2.553F, 1.606F)
          lineToRelative(4.73F, -0.717F)
          curveToRelative(0.797F, -0.121F, 1.442F, -0.707F, 1.64F, -1.487F)
          lineToRelative(1.51F, -5.96F)
          curveToRelative(0.726F, -2.86F, -1.172F, -5.722F, -4.09F, -6.17F)
          lineToRelative(-4.902F, -0.752F)
          curveTo(17.366F, 12.816F, 17.0F, 12.397F, 17.0F, 11.903F)
          verticalLineTo(5.5F)
          curveTo(17.0F, 4.672F, 16.333F, 4.0F, 15.505F, 4.0F)
          close()
          moveToRelative(-3.502F, 1.5F)
          curveToRelative(0.0F, -1.933F, 1.568F, -3.5F, 3.502F, -3.5F)
          curveTo(17.438F, 2.0F, 19.0F, 3.567F, 19.0F, 5.5F)
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
