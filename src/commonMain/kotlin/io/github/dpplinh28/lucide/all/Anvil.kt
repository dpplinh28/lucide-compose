package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anvil") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                horizontalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, 7f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 20f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
}

public val LucideIcons.All.AnvilDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anvil: ImageVector
    @Composable get() = AnvilDefinition.asImageVector()
