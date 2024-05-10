package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SendClock24: ImageVector
  get() {
    if (_sendClock24 != null) {
      return _sendClock24!!
    }
    _sendClock24 = fluentIcon(name = "Filled.SendClock24", 24f) {
      materialPath {
          moveTo(5.283F, 13.452F)
          lineToRelative(7.532F, -1.255F)
          curveToRelative(0.084F, -0.014F, 0.15F, -0.08F, 0.164F, -0.164F)
          curveToRelative(0.018F, -0.11F, -0.055F, -0.213F, -0.164F, -0.23F)
          lineToRelative(-7.532F, -1.256F)
          curveToRelative(-0.176F, -0.03F, -0.323F, -0.15F, -0.386F, -0.318F)
          lineTo(2.3F, 3.272F)
          curveToRelative(-0.248F, -0.64F, 0.421F, -1.25F, 1.035F, -0.943F)
          lineToRelative(18.0F, 9.0F)
          curveToRelative(0.443F, 0.221F, 0.53F, 0.772F, 0.263F, 1.125F)
          curveTo(20.48F, 11.544F, 19.053F, 11.0F, 17.5F, 11.0F)
          curveToRelative(-3.59F, 0.0F, -6.5F, 2.91F, -6.5F, 6.5F)
          curveToRelative(0.0F, 0.112F, 0.003F, 0.223F, 0.008F, 0.333F)
          lineToRelative(-7.674F, 3.838F)
          curveToRelative(-0.614F, 0.306F, -1.283F, -0.304F, -1.035F, -0.943F)
          lineToRelative(2.598F, -6.958F)
          curveToRelative(0.063F, -0.167F, 0.21F, -0.288F, 0.386F, -0.318F)
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
