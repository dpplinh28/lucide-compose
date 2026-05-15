package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shirt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.38f, 3.46f)
                lineTo(16f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                lineTo(3.62f, 3.46f)
                arcToRelative(2f, 2f, 0f, false, false, -1.34f, 2.23f)
                lineToRelative(.58f, 3.47f)
                arcToRelative(1f, 1f, 0f, false, false, .99f, .84f)
                horizontalLineTo(6f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(10f)
                horizontalLineToRelative(2.15f)
                arcToRelative(1f, 1f, 0f, false, false, .99f, -.84f)
                lineToRelative(.58f, -3.47f)
                arcToRelative(2f, 2f, 0f, false, false, -1.34f, -2.23f)
                close()
            }
}

public val LucideIcons.All.ShirtDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shirt: ImageVector
    @Composable get() = ShirtDefinition.asImageVector()
