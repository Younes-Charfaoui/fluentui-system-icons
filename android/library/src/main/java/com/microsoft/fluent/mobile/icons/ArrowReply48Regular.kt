package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReply48: ImageVector
  get() {
    if (_arrowReply48 != null) {
      return _arrowReply48!!
    }
    _arrowReply48 = fluentIcon(name = "Regular.ArrowReply48", 48f) {
      materialPath {
          moveTo(17.134F, 10.134F)
          curveToRelative(0.488F, -0.488F, 0.488F, -1.28F, 0.0F, -1.768F)
          reflectiveCurveToRelative(-1.28F, -0.488F, -1.768F, 0.0F)
          lineToRelative(-11.0F, 11.0F)
          curveToRelative(-0.488F, 0.488F, -0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(11.0F, 11.0F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, -1.28F, 0.0F, -1.768F)
          lineTo(8.268F, 21.5F)
          horizontalLineTo(25.25F)
          curveToRelative(8.975F, 0.0F, 16.25F, 7.275F, 16.25F, 16.25F)
          curveToRelative(0.0F, 0.69F, 0.56F, 1.25F, 1.25F, 1.25F)
          reflectiveCurveTo(44.0F, 38.44F, 44.0F, 37.75F)
          curveTo(44.0F, 27.395F, 35.605F, 19.0F, 25.25F, 19.0F)
          horizontalLineTo(8.268F)
          lineToRelative(8.866F, -8.866F)
          close()        
      }
    }
    return _arrowReply48!!
  }

private var _arrowReply48: ImageVector? = null
