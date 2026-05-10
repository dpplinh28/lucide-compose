package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WholeWord") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 7f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, .5f, -.5f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-.5f, 0f, -1f, -.5f, -1f, -1f)
                verticalLineToRelative(-1f)
            }
}

public val LucideIcons.All.WholeWordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WholeWord: ImageVector
    @Composable get() = WholeWordDefinition.asImageVector()
