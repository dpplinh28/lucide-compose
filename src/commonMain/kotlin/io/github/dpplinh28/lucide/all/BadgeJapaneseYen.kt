package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BadgeJapaneseYen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 8f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 11f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.BadgeJapaneseYenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BadgeJapaneseYen: ImageVector
    @Composable get() = BadgeJapaneseYenDefinition.asImageVector()
