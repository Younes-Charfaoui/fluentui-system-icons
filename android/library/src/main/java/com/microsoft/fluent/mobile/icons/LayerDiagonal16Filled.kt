package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayerDiagonal16: ImageVector
  get() {
    if (_layerDiagonal16 != null) {
      return _layerDiagonal16!!
    }
    _layerDiagonal16 = fluentIcon(name = "Filled.LayerDiagonal16", 16f) {
      materialPath {
          moveTo(3.0F, 10.915F)
          verticalLineToRelative(-4.29F)
          curveToRelative(0.0F, -0.975F, 0.567F, -1.861F, 1.452F, -2.27F)
          lineToRelative(4.5F, -2.077F)
          lineToRelative(0.03F, -0.013F)
          curveTo(8.835F, 1.322F, 7.824F, 0.73F, 6.909F, 1.123F)
          lineTo(2.515F, 3.006F)
          curveTo(1.596F, 3.4F, 1.0F, 4.304F, 1.0F, 5.304F)
          verticalLineTo(9.5F)
          curveToRelative(0.0F, 1.044F, 1.035F, 1.758F, 2.0F, 1.414F)
          close()
          moveToRelative(3.0F, 1.996F)
          verticalLineTo(8.645F)
          curveToRelative(0.0F, -1.0F, 0.596F, -1.904F, 1.515F, -2.298F)
          lineToRelative(4.483F, -1.922F)
          curveToRelative(-0.05F, -1.034F, -1.123F, -1.716F, -2.089F, -1.302F)
          lineToRelative(-5.0F, 2.143F)
          curveTo(4.358F, 5.502F, 4.0F, 6.044F, 4.0F, 6.644F)
          verticalLineToRelative(4.853F)
          curveToRelative(0.0F, 1.044F, 1.035F, 1.758F, 2.0F, 1.414F)
          close()
          moveToRelative(6.91F, -7.788F)
          curveTo(13.898F, 4.699F, 15.0F, 5.425F, 15.0F, 6.502F)
          verticalLineToRelative(4.826F)
          curveToRelative(0.0F, 0.598F, -0.355F, 1.138F, -0.903F, 1.376F)
          lineToRelative(-5.0F, 2.169F)
          curveTo(8.107F, 15.303F, 7.0F, 14.576F, 7.0F, 13.496F)
          verticalLineTo(8.645F)
          curveToRelative(0.0F, -0.6F, 0.358F, -1.143F, 0.91F, -1.38F)
          lineToRelative(5.0F, -2.142F)
          close()        
      }
    }
    return _layerDiagonal16!!
  }

private var _layerDiagonal16: ImageVector? = null
