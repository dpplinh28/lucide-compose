package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextWrap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(14.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 7f)
                horizontalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.TextWrapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextWrap: ImageVector
    @Composable get() = TextWrapDefinition.asImageVector()
