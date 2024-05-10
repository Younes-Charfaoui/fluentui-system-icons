package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Mail28: ImageVector
  get() {
    if (_mail28 != null) {
      return _mail28!!
    }
    _mail28 = fluentIcon(name = "Filled.Mail28", 28f) {
      materialPath {
          moveTo(2.004F, 7.75F)
          curveTo(2.004F, 5.679F, 3.683F, 4.0F, 5.754F, 4.0F)
          horizontalLineTo(22.25F)
          curveTo(24.32F, 4.0F, 26.0F, 5.679F, 26.0F, 7.75F)
          verticalLineToRelative(0.01F)
          lineToRelative(-12.0F, 6.148F)
          lineTo(2.004F, 7.764F)
          verticalLineTo(7.75F)
          close()
          moveToRelative(0.0F, 1.699F)
          verticalLineToRelative(9.801F)
          curveToRelative(0.0F, 2.071F, 1.679F, 3.75F, 3.75F, 3.75F)
          horizontalLineTo(22.25F)
          curveToRelative(2.07F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineTo(9.446F)
          lineToRelative(-11.66F, 5.972F)
          curveToRelative(-0.214F, 0.11F, -0.469F, 0.11F, -0.683F, 0.0F)
          lineTo(2.004F, 9.449F)
          close()        
      }
    }
    return _mail28!!
  }

private var _mail28: ImageVector? = null
