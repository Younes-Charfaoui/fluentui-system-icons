package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Mail28: ImageVector
  get() {
    if (_mail28 != null) {
      return _mail28!!
    }
    _mail28 = fluentIcon(name = "Regular.Mail28", 28f) {
      materialPath {
          moveTo(5.754F, 4.0F)
          curveToRelative(-2.071F, 0.0F, -3.75F, 1.679F, -3.75F, 3.75F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineTo(22.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(7.75F)
          curveTo(26.0F, 5.679F, 24.32F, 4.0F, 22.25F, 4.0F)
          horizontalLineTo(5.753F)
          close()
          moveToRelative(-2.25F, 3.75F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineTo(22.25F)
          curveToRelative(1.242F, 0.0F, 2.25F, 1.007F, 2.25F, 2.25F)
          verticalLineToRelative(0.779F)
          lineTo(14.0F, 13.907F)
          lineTo(3.504F, 8.531F)
          verticalLineTo(7.75F)
          close()
          moveToRelative(0.0F, 2.467F)
          lineToRelative(10.154F, 5.2F)
          curveToRelative(0.215F, 0.11F, 0.469F, 0.11F, 0.684F, 0.0F)
          lineTo(24.5F, 10.215F)
          verticalLineToRelative(9.036F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(5.755F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineToRelative(-9.033F)
          close()        
      }
    }
    return _mail28!!
  }

private var _mail28: ImageVector? = null
