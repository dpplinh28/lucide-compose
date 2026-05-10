package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FingerprintPattern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                curveToRelative(0f, 1.02f, -.1f, 2.51f, -.26f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 13.12f)
                curveToRelative(0f, 2.38f, 0f, 6.38f, -1f, 8.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.29f, 21.02f)
                curveToRelative(.12f, -.6f, .43f, -2.3f, .5f, -3.02f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(10f, 10f, 0f, false, true, 18f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.8f, 16f)
                curveToRelative(.2f, -2f, .131f, -5.354f, 0f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 19.5f)
                curveTo(5.5f, 18f, 6f, 15f, 6f, 12f)
                arcToRelative(6f, 6f, 0f, false, true, .34f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.65f, 22f)
                curveToRelative(.21f, -.66f, .45f, -1.32f, .57f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 6.8f)
                arcToRelative(6f, 6f, 0f, false, true, 9f, 5.2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.FingerprintPatternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FingerprintPattern: ImageVector
    @Composable get() = FingerprintPatternDefinition.asImageVector()
