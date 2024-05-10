package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailEdit32: ImageVector
  get() {
    if (_mailEdit32 != null) {
      return _mailEdit32!!
    }
    _mailEdit32 = fluentIcon(name = "Filled.MailEdit32", 32f) {
      materialPath {
          moveTo(6.5F, 4.0F)
          curveTo(4.08F, 4.0F, 2.107F, 5.909F, 2.004F, 8.303F)
          lineToRelative(1.476F, 0.82F)
          lineTo(16.0F, 15.864F)
          lineToRelative(12.52F, -6.741F)
          lineToRelative(1.476F, -0.82F)
          curveTo(29.893F, 5.909F, 27.919F, 4.0F, 25.5F, 4.0F)
          horizontalLineToRelative(-19.0F)
          close()
          moveTo(2.0F, 21.5F)
          verticalLineTo(10.588F)
          lineToRelative(0.514F, 0.286F)
          lineToRelative(13.012F, 7.007F)
          curveToRelative(0.296F, 0.159F, 0.652F, 0.159F, 0.948F, 0.0F)
          lineToRelative(13.0F, -7.0F)
          lineTo(30.0F, 10.588F)
          verticalLineToRelative(4.332F)
          curveToRelative(-1.628F, -0.773F, -3.64F, -0.487F, -4.988F, 0.873F)
          lineToRelative(-8.567F, 8.64F)
          curveToRelative(-0.44F, 0.444F, -0.773F, 0.98F, -0.976F, 1.567F)
          horizontalLineTo(6.5F)
          curveTo(4.015F, 26.0F, 2.0F, 23.985F, 2.0F, 21.5F)
          close()
          moveToRelative(28.144F, -0.576F)
          lineToRelative(-8.61F, 8.543F)
          curveToRelative(-0.35F, 0.349F, -0.789F, 0.598F, -1.269F, 0.721F)
          lineToRelative(-3.02F, 0.778F)
          curveToRelative(-0.737F, 0.19F, -1.407F, -0.482F, -1.216F, -1.22F)
          lineToRelative(0.79F, -3.05F)
          curveToRelative(0.118F, -0.456F, 0.355F, -0.872F, 0.686F, -1.206F)
          lineToRelative(8.567F, -8.64F)
          curveToRelative(1.148F, -1.159F, 3.028F, -1.133F, 4.144F, 0.057F)
          curveToRelative(1.067F, 1.137F, 1.035F, 2.918F, -0.072F, 4.017F)
          close()        
      }
    }
    return _mailEdit32!!
  }

private var _mailEdit32: ImageVector? = null
