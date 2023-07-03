package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowUp28: ImageVector
  get() {
    if (_arrowUp28 != null) {
      return _arrowUp28!!
    }
    _arrowUp28 = fluentIcon(name = "Regular.ArrowUp28", 28f) {
      materialPath {
          moveTo(4.211F, 12.733F)
          curveToRelative(-0.287F, 0.298F, -0.278F, 0.773F, 0.021F, 1.06F)
          curveToRelative(0.298F, 0.287F, 0.773F, 0.278F, 1.06F, -0.02F)
          lineToRelative(7.96F, -8.275F)
          verticalLineToRelative(18.753F)
          curveToRelative(0.0F, 0.415F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.335F, 0.75F, -0.75F)
          verticalLineTo(5.5F)
          lineToRelative(7.958F, 8.274F)
          curveToRelative(0.288F, 0.298F, 0.762F, 0.307F, 1.061F, 0.02F)
          curveToRelative(0.299F, -0.287F, 0.308F, -0.762F, 0.02F, -1.06F)
          lineToRelative(-9.069F, -9.428F)
          curveToRelative(-0.393F, -0.41F, -1.048F, -0.41F, -1.441F, 0.0F)
          lineToRelative(-9.07F, 9.428F)
          close()        
      }
    }
    return _arrowUp28!!
  }

private var _arrowUp28: ImageVector? = null
