package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailRead24: ImageVector
  get() {
    if (_mailRead24 != null) {
      return _mailRead24!!
    }
    _mailRead24 = fluentIcon(name = "Filled.MailRead24", 24f) {
      materialPath {
          moveTo(10.81F, 2.34F)
          curveToRelative(0.728F, -0.455F, 1.652F, -0.455F, 2.38F, 0.0F)
          lineToRelative(7.75F, 4.833F)
          curveToRelative(0.078F, 0.048F, 0.151F, 0.1F, 0.221F, 0.157F)
          lineTo(12.0F, 12.15F)
          lineTo(2.834F, 7.333F)
          curveToRelative(0.071F, -0.057F, 0.147F, -0.11F, 0.225F, -0.16F)
          lineToRelative(7.75F, -4.834F)
          close()
          moveTo(2.048F, 8.614F)
          curveTo(2.017F, 8.767F, 2.0F, 8.924F, 2.0F, 9.082F)
          verticalLineToRelative(7.668F)
          curveTo(2.0F, 18.545F, 3.455F, 20.0F, 5.25F, 20.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(9.082F)
          curveToRelative(0.0F, -0.16F, -0.017F, -0.319F, -0.05F, -0.473F)
          lineToRelative(-9.6F, 5.052F)
          curveToRelative(-0.22F, 0.115F, -0.48F, 0.115F, -0.699F, 0.0F)
          lineTo(2.05F, 8.615F)
          close()        
      }
    }
    return _mailRead24!!
  }

private var _mailRead24: ImageVector? = null
