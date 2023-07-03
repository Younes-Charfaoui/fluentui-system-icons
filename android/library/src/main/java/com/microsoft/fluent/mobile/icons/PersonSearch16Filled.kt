package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonSearch16: ImageVector
  get() {
    if (_personSearch16 != null) {
      return _personSearch16!!
    }
    _personSearch16 = fluentIcon(name = "Filled.PersonSearch16", 16f) {
      materialPath {
          moveTo(12.5F, 8.0F)
          curveTo(13.328F, 8.0F, 14.0F, 8.672F, 14.0F, 9.5F)
          verticalLineTo(10.0F)
          curveToRelative(0.0F, 1.742F, -1.452F, 3.53F, -3.958F, 3.921F)
          lineToRelative(-1.48F, -1.48F)
          curveTo(8.841F, 11.852F, 9.0F, 11.194F, 9.0F, 10.5F)
          curveTo(9.0F, 9.575F, 8.72F, 8.715F, 8.242F, 8.0F)
          horizontalLineTo(12.5F)
          close()
          moveTo(9.0F, 1.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, 1.231F, 2.75F, 2.75F)
          reflectiveCurveTo(10.519F, 7.0F, 9.0F, 7.0F)
          reflectiveCurveTo(6.25F, 5.769F, 6.25F, 4.25F)
          reflectiveCurveTo(7.481F, 1.5F, 9.0F, 1.5F)
          close()
          moveTo(4.5F, 14.0F)
          curveToRelative(0.786F, 0.0F, 1.512F, -0.26F, 2.096F, -0.697F)
          lineToRelative(2.55F, 2.55F)
          curveToRelative(0.196F, 0.196F, 0.512F, 0.196F, 0.707F, 0.0F)
          curveToRelative(0.196F, -0.195F, 0.196F, -0.511F, 0.0F, -0.707F)
          lineToRelative(-2.55F, -2.55F)
          curveTo(7.741F, 12.012F, 8.0F, 11.286F, 8.0F, 10.5F)
          curveTo(8.0F, 8.567F, 6.433F, 7.0F, 4.5F, 7.0F)
          reflectiveCurveTo(1.0F, 8.567F, 1.0F, 10.5F)
          reflectiveCurveTo(2.567F, 14.0F, 4.5F, 14.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          curveTo(3.12F, 13.0F, 2.0F, 11.88F, 2.0F, 10.5F)
          reflectiveCurveTo(3.12F, 8.0F, 4.5F, 8.0F)
          reflectiveCurveTo(7.0F, 9.12F, 7.0F, 10.5F)
          reflectiveCurveTo(5.88F, 13.0F, 4.5F, 13.0F)
          close()        
      }
    }
    return _personSearch16!!
  }

private var _personSearch16: ImageVector? = null
