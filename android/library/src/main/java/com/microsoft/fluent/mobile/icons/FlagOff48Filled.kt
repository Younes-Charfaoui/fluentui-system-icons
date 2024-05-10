package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FlagOff48: ImageVector
  get() {
    if (_flagOff48 != null) {
      return _flagOff48!!
    }
    _flagOff48 = fluentIcon(name = "Filled.FlagOff48", 48f) {
      materialPath {
          moveTo(31.232F, 33.0F)
          lineToRelative(10.634F, 10.634F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(-37.5F, -37.5F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineTo(7.5F, 9.268F)
          verticalLineTo(42.75F)
          curveTo(7.5F, 43.44F, 8.06F, 44.0F, 8.75F, 44.0F)
          reflectiveCurveTo(10.0F, 43.44F, 10.0F, 42.75F)
          verticalLineTo(33.0F)
          horizontalLineToRelative(21.232F)
          close()
          moveToRelative(10.018F, 0.0F)
          horizontalLineToRelative(-3.653F)
          lineToRelative(-27.0F, -27.0F)
          horizontalLineTo(41.25F)
          curveToRelative(0.471F, 0.0F, 0.902F, 0.265F, 1.115F, 0.686F)
          curveToRelative(0.213F, 0.42F, 0.171F, 0.924F, -0.108F, 1.304F)
          lineTo(33.801F, 19.5F)
          lineToRelative(8.456F, 11.51F)
          curveToRelative(0.28F, 0.38F, 0.321F, 0.884F, 0.108F, 1.305F)
          curveTo(42.152F, 32.735F, 41.721F, 33.0F, 41.25F, 33.0F)
          close()        
      }
    }
    return _flagOff48!!
  }

private var _flagOff48: ImageVector? = null
