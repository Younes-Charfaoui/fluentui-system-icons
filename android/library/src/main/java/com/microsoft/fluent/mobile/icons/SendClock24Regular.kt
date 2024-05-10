package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SendClock24: ImageVector
  get() {
    if (_sendClock24 != null) {
      return _sendClock24!!
    }
    _sendClock24 = fluentIcon(name = "Regular.SendClock24", 24f) {
      materialPath {
          moveTo(2.3F, 3.272F)
          lineTo(5.693F, 12.0F)
          lineToRelative(-3.395F, 8.728F)
          lineToRelative(-0.03F, 0.096F)
          curveToRelative(-0.151F, 0.602F, 0.482F, 1.138F, 1.065F, 0.847F)
          lineToRelative(7.674F, -3.838F)
          curveTo(11.003F, 17.723F, 11.0F, 17.612F, 11.0F, 17.5F)
          curveToRelative(0.0F, -0.487F, 0.053F, -0.96F, 0.155F, -1.417F)
          lineTo(4.402F, 19.46F)
          lineToRelative(2.61F, -6.71F)
          horizontalLineToRelative(6.051F)
          curveToRelative(0.391F, -0.366F, 0.828F, -0.684F, 1.3F, -0.944F)
          curveToRelative(-0.085F, -0.32F, -0.377F, -0.556F, -0.724F, -0.556F)
          horizontalLineTo(7.01F)
          lineTo(4.402F, 4.54F)
          lineToRelative(12.924F, 6.462F)
          lineTo(17.5F, 11.0F)
          curveToRelative(1.553F, 0.0F, 2.98F, 0.545F, 4.098F, 1.454F)
          curveToRelative(0.267F, -0.353F, 0.179F, -0.903F, -0.264F, -1.125F)
          lineToRelative(-18.0F, -9.0F)
          lineTo(3.24F, 2.29F)
          curveTo(2.655F, 2.084F, 2.063F, 2.665F, 2.3F, 3.273F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          reflectiveCurveTo(12.0F, 14.462F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          close()
          moveTo(17.5F, 14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(20.276F, 18.0F, 20.0F, 18.0F)
          horizontalLineToRelative(-2.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          close()        
      }
    }
    return _sendClock24!!
  }

private var _sendClock24: ImageVector? = null
