package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReply32: ImageVector
  get() {
    if (_arrowReply32 != null) {
      return _arrowReply32!!
    }
    _arrowReply32 = fluentIcon(name = "Filled.ArrowReply32", 32f) {
      materialPath {
          moveTo(12.134F, 6.366F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          lineTo(7.268F, 13.0F)
          horizontalLineToRelative(9.482F)
          curveTo(23.515F, 13.0F, 29.0F, 18.485F, 29.0F, 25.25F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          reflectiveCurveToRelative(-1.25F, -0.56F, -1.25F, -1.25F)
          verticalLineToRelative(-0.5F)
          curveToRelative(0.0F, -5.385F, -4.365F, -9.75F, -9.75F, -9.75F)
          horizontalLineTo(7.268F)
          lineToRelative(4.866F, 4.866F)
          curveToRelative(0.488F, 0.488F, 0.488F, 1.28F, 0.0F, 1.768F)
          reflectiveCurveToRelative(-1.28F, 0.488F, -1.768F, 0.0F)
          lineToRelative(-7.0F, -7.0F)
          curveToRelative(-0.488F, -0.488F, -0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(7.0F, -7.0F)
          curveToRelative(0.488F, -0.488F, 1.28F, -0.488F, 1.768F, 0.0F)
          close()        
      }
    }
    return _arrowReply32!!
  }

private var _arrowReply32: ImageVector? = null
