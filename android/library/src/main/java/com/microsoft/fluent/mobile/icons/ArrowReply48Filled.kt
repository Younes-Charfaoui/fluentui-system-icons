package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReply48: ImageVector
  get() {
    if (_arrowReply48 != null) {
      return _arrowReply48!!
    }
    _arrowReply48 = fluentIcon(name = "Filled.ArrowReply48", 48f) {
      materialPath {
          moveTo(17.56F, 10.56F)
          curveToRelative(0.586F, -0.585F, 0.586F, -1.535F, 0.0F, -2.12F)
          curveToRelative(-0.585F, -0.586F, -1.535F, -0.586F, -2.12F, 0.0F)
          lineToRelative(-11.0F, 11.0F)
          curveToRelative(-0.587F, 0.585F, -0.587F, 1.535F, 0.0F, 2.12F)
          lineToRelative(11.0F, 11.0F)
          curveToRelative(0.585F, 0.586F, 1.535F, 0.586F, 2.12F, 0.0F)
          curveToRelative(0.586F, -0.585F, 0.586F, -1.535F, 0.0F, -2.12F)
          lineTo(9.122F, 22.0F)
          horizontalLineTo(24.5F)
          curveTo(33.613F, 22.0F, 41.0F, 29.387F, 41.0F, 38.5F)
          curveToRelative(0.0F, 0.828F, 0.672F, 1.5F, 1.5F, 1.5F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          curveTo(44.0F, 27.73F, 35.27F, 19.0F, 24.5F, 19.0F)
          horizontalLineTo(9.121F)
          lineToRelative(8.44F, -8.44F)
          close()        
      }
    }
    return _arrowReply48!!
  }

private var _arrowReply48: ImageVector? = null
