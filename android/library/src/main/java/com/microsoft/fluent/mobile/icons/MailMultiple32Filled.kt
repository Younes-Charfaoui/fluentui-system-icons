package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.MailMultiple32: ImageVector
  get() {
    if (_mailMultiple32 != null) {
      return _mailMultiple32!!
    }
    _mailMultiple32 = fluentIcon(name = "Filled.MailMultiple32", 32f) {
      materialPath {
          moveTo(7.5F, 5.0F)
          curveTo(5.403F, 5.0F, 3.64F, 6.435F, 3.142F, 8.376F)
          lineToRelative(11.357F, 6.473F)
          lineToRelative(11.354F, -6.496F)
          curveTo(25.345F, 6.423F, 23.589F, 5.0F, 21.5F, 5.0F)
          horizontalLineToRelative(-14.0F)
          close()
          moveTo(3.0F, 19.5F)
          verticalLineToRelative(-8.903F)
          lineToRelative(11.005F, 6.272F)
          curveToRelative(0.307F, 0.175F, 0.684F, 0.175F, 0.992F, 0.0F)
          lineTo(26.0F, 10.572F)
          verticalLineTo(19.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-14.0F)
          curveTo(5.015F, 24.0F, 3.0F, 21.985F, 3.0F, 19.5F)
          close()
          moveToRelative(8.0F, 8.0F)
          curveToRelative(-1.56F, 0.0F, -2.935F, -0.794F, -3.742F, -2.0F)
          horizontalLineTo(22.0F)
          curveToRelative(3.038F, 0.0F, 5.5F, -2.462F, 5.5F, -5.5F)
          verticalLineTo(9.258F)
          curveToRelative(1.206F, 0.807F, 2.0F, 2.182F, 2.0F, 3.742F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 4.142F, -3.358F, 7.5F, -7.5F, 7.5F)
          horizontalLineTo(11.0F)
          close()        
      }
    }
    return _mailMultiple32!!
  }

private var _mailMultiple32: ImageVector? = null
