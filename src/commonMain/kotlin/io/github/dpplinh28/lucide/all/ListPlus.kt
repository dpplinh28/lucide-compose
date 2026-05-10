package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 9f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.ListPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListPlus: ImageVector
    @Composable get() = ListPlusDefinition.asImageVector()
