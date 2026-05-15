package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CandyCane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.8f, 5f)
                lineToRelative(2.111f, 4.223f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.75f, 7f)
                lineTo(15f, 2.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.874f, 14.647f)
                lineToRelative(2.12f, 4.24f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.7f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -3.5f, -2f)
                lineToRelative(8.6f, -14f)
                arcToRelative(6f, 6f, 0f, false, true, 10.4f, 6f)
                arcToRelative(2f, 2f, 0f, true, true, -3.464f, -2f)
                arcToRelative(2f, 2f, 0f, true, false, -3.464f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.906f, 9.712f)
                lineToRelative(2.005f, 4.411f)
            }
}

public val LucideIcons.All.CandyCaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CandyCane: ImageVector
    @Composable get() = CandyCaneDefinition.asImageVector()
