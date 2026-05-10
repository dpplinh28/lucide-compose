package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.43f, 12.935f)
                curveToRelative(.357f, -.967f, .57f, -1.955f, .57f, -2.935f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(32.197f, 32.197f, 0f, false, false, .813f, -.728f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 18f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.MapPinCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinCheck: ImageVector
    @Composable get() = MapPinCheckDefinition.asImageVector()
