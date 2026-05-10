package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenetianMask") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                curveToRelative(-1.5f, 0f, -2.5f, .5f, -3f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                arcToRelative(8f, 8f, 0f, false, true, 5f, 2f)
                arcToRelative(8f, 8f, 0f, false, true, 5f, -2f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, -5f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-3f)
                arcToRelative(8f, 8f, 0f, false, false, -5f, 2f)
                arcToRelative(8f, 8f, 0f, false, false, -5f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                curveToRelative(1.5f, 0f, 2.5f, .5f, 3f, 2f)
            }
}

public val LucideIcons.All.VenetianMaskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenetianMask: ImageVector
    @Composable get() = VenetianMaskDefinition.asImageVector()
