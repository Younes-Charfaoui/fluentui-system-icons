package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder24: ImageVector
  get() {
    if (_folder24 != null) {
      return _folder24!!
    }
    _folder24 = fluentIcon(name = "Filled.Folder24", 24f) {
      materialPath {
          moveTo(2.0F, 8.0F)
          verticalLineTo(6.25F)
          curveTo(2.0F, 4.455F, 3.455F, 3.0F, 5.25F, 3.0F)
          horizontalLineToRelative(2.879F)
          curveToRelative(0.596F, 0.0F, 1.169F, 0.237F, 1.59F, 0.659F)
          lineToRelative(1.531F, 1.53F)
          lineTo(8.659F, 7.78F)
          curveTo(8.519F, 7.921F, 8.328F, 8.0F, 8.129F, 8.0F)
          horizontalLineTo(2.0F)
          close()
          moveToRelative(0.0F, 1.5F)
          verticalLineToRelative(8.25F)
          curveTo(2.0F, 19.545F, 3.455F, 21.0F, 5.25F, 21.0F)
          horizontalLineToRelative(13.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.0F)
          curveToRelative(0.0F, -1.795F, -1.455F, -3.25F, -3.25F, -3.25F)
          horizontalLineToRelative(-5.69F)
          lineTo(9.72F, 8.841F)
          curveTo(9.298F, 9.263F, 8.725F, 9.5F, 8.129F, 9.5F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _folder24!!
  }

private var _folder24: ImageVector? = null
