package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ShareIos28: ImageVector
  get() {
    if (_shareIos28 != null) {
      return _shareIos28!!
    }
    _shareIos28 = fluentIcon(name = "Regular.ShareIos28", 28f) {
      materialPath {
          moveTo(14.0F, 2.0F)
          curveToRelative(0.102F, 0.0F, 0.199F, 0.02F, 0.287F, 0.057F)
          curveToRelative(0.088F, 0.037F, 0.171F, 0.09F, 0.243F, 0.163F)
          lineToRelative(6.75F, 6.75F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-5.47F, -5.47F)
          verticalLineToRelative(13.69F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(4.56F)
          lineToRelative(-5.47F, 5.47F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(6.75F, -6.75F)
          curveToRelative(0.072F, -0.072F, 0.154F, -0.127F, 0.243F, -0.163F)
          curveTo(13.8F, 2.02F, 13.898F, 2.0F, 14.0F, 2.0F)
          close()
          moveTo(4.5F, 13.75F)
          curveTo(4.5F, 13.336F, 4.164F, 13.0F, 3.75F, 13.0F)
          reflectiveCurveTo(3.0F, 13.336F, 3.0F, 13.75F)
          verticalLineToRelative(7.5F)
          curveTo(3.0F, 23.321F, 4.679F, 25.0F, 6.75F, 25.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(2.071F, 0.0F, 3.75F, -1.679F, 3.75F, -3.75F)
          verticalLineToRelative(-7.5F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(7.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(6.75F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineToRelative(-7.5F)
          close()        
      }
    }
    return _shareIos28!!
  }

private var _shareIos28: ImageVector? = null
